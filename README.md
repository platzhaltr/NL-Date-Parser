# Natural Language Date Parser #

## Build ##

	git clone https://github.com/platzhaltr/NL-Date-Parser

### Eclipse ###

- [Eclipse](http://www.eclipse.org/)
- [m2eclipse](http://m2eclipse.sonatype.org/) Maven plugin for Eclipse

1. Import with Eclipse using `File > Import... > Existing maven projects`
2. To include the sources that [SableCC](http://sablecc.org/) generates under `target/generated-sources/sablecc` open `Preferences > Maven` and add `sablecc:generate` to `Goals to run when updating project configuration`
3. To generate the sources I use the command line `mvn sablecc:generate`
4. Update the project configuration

### Commandline ###

	mvn sablecc:generate package

### Known Problems ###

#### parser.dat not found ####
In case you get a "ParserException: parser.dat not found" during execution, please have a look at the source directory `target/generated-sources/sablecc`. During the automatic build Eclipse actives an include-filter for the build path which includes all java-files only `**/*.java`. Please either remove the filter or add another filter which includes the parser.dat as well.

	
## Theorie ##

### Absolute Zeitangaben ###

#### Zeitangabe zu Beginn ####

- `Am Sonntag treffen mit Klaus` ganztägig; impliziert nächsten möglichen Sonntag
- `Am Sonntag 12 Uhr treffen mit Klaus`
- `Am 12. April treffen mit Klaus` ganztägig
- `Am 12.04. um 13Uhr treffen mit Klaus`
- `Am 12. April ab 13Uhr treffen mit Klaus` für wie lange? Standardlänge annehmen 
- `Am 12. April 13-15Uhr treffen mit Klaus`
- `Am 06. 13 Uhr telco mit Klaus` impliziert gleichen Monat, ansonsten nächster Monat
- `Ab 30. April eine Woche Urlaub`
- `x Uhr Klaus anrufen` impliziert nächste mögliche Uhrzeit; kann zu widerspruch führen

#### Zeitangabe am Ende ####

- `Einkaufen mit Klaus am 04. April` ganztätig
- `Einkaufen mit Klaus am 04.04` ganztätig
- `Einkaufen mit Klaus am 04. April um 13 Uhr`
- `Einkaufen mit Klaus am 04.04 um 13 Uhr`
- `Einkaufen mit Klaus am 04. April um 13 Uhr für 2 Stunden`
- `Einkaufen mit Klaus am 04.04 um 13 Uhr für 2 Stunden`
- `2 Stunden Einkaufen mit Klaus am 04. April um 13 Uhr` Angabe mit Dauer
- `2 Stunden Einkaufen mit Klaus am 04.04 um 13 Uhr` Angabe mit Dauer

### Relative Zeitangaben ###

- `Treffen mit Klaus` ab jetzt; automatischer Eintrag für eine Stunde

- `Heute ( um x Uhr treffen mit Klaus` kann zu widerspruch führen
- `Morgen ( um x Uhr treffen mit Klaus` kann zu widerspruch führen
- `Übermorgen	( um x Uhr treffen mit Klaus` kann zu widerspruch führen
- `früh/vormittag/mittag/nachmittag/abend treffen mit Klaus` feste Uhrzeiten vergeben
- `Nächste Woche keine Meetings` kein Datum eingetragen; ganztätig

- `In x Stunden treffen mit Klaus` fest Zeit bis zum Ereignis; selbst bestimmt
- `In x Minuten` fest Zeit bis zum Ereignis; selbst bestimmt
- `In x Sekunden` fest Zeit bis zum Ereignis; selbst bestimmt

- `Später/Nachher Fische füttern` Abwandlung von "in ... "; feste Zeit bis zum Ereignis; fest bestimmt; z.B. in 2 Stunden

- `Treffen mit Klaus bis x Uhr` ab jetzt, bis Zeitpunkt angegeben
- `Treffen mit Klaus bis x Uhr für x Stunden`
- `Treffen mit Klaus bis x Uhr für x Minuten`
- `Treffen mit Klaus bis x Uhr für x Sekunden`

- `Am Karfreitag mit Olli programmieren` Karfreitag: woher das Datum; ganztätig
- `Karfreitag 13Uhr mit Olli programmieren; 2Stunden` Karfreitag: woher das Datum holen; ganztätig

- `Am letzten Freitag im Monat`
- `Über das Osterwochenende treffen mit Klaus Eltern` woher das Datum holen

- `Ab morgen eine Woche Urlaub`
- `Ab morgen für 2 Tage Urlaub`

- `Nächsten Montag und Mittwoch`
- `Nächsten Montag, Mittwoch, Freitag`
- `Nächsten Montag bis Donnerstag`
- `Nächstes Wochenende`

### Wiederholende Zeitangaben ###

- `Jeder 2. Sonntag`
- `Jeder 2. Werktag`
- `Jedes 2. Wochenende`
- `Jeder 3. Mai`
- `Jeder 03. eines Monats`
- `Jeden/Immer Mittwoch/Mittwochs`
- `Immer am 3. eines Monats`
- `Alle 2 Wochen am Montag`

### Allgemein/Ideen ###

- Terminkonflikte hervorheben
- Soll ein Stoppzeichen benutzt werden um Zeitangaben anzugeben? z.b. "Treffen mit Klaus; 04.04. 13uhr"
- Regeln einführen
	- `@rule Niemals zwischen 12-13uhr Termin`
	- "@rule Immer zwischen 12-13uhr Mittagspause`
	- `@rule Wenn ... dann ... ` sinnvoll? 
	- Bei Eintrag eines Termins stößt das Programm auf einen Widerspruch; anzeigen
	- `@rule jeden Tag etwas tun`
	- `@rule jeden 2. Mittwoch`
- Einträge ohne Zeitangabe ( weder absolute noch relativ gelten als ToDo!
	- `Klaus treffen`
	- `Einkaufen`
- Termine/ToDos Kontexten zuweisen
- Importieren von
	- festen Daten von Service (Internet)
	- Feiertage
	- Bundesliga termine
- Erinnerungen einbauen
	- Zweite zeile im UI
	- Eigene Syntax? 
		- `@remindMe` `@method` `email @to`
		- default werte in Einstellungen
