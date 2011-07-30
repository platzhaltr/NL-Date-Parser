# Natural Language Date Parser #

## Build ##

	git clone https://github.com/platzhaltr/NL-Date-Parser

### Eclipse ###

- [Eclipse](http://www.eclipse.org/)
- [m2eclipse](http://m2eclipse.sonatype.org/) Maven plugin for Eclipse

1. Import with Eclipse using `File > Import... > Existing maven projects`
2. To include the sources that [SableCC](http://sablecc.org/) generates under target/generated-sources/sablecc` open the preferences, 
hightlight maven and add `sablecc:generate` to `Goals to run when updating project configuration`
3. To generate the sources I use the command line `mvn sablecc:generate`
4. Update the project configuration

### Commandline ###

	mvn sablecc:generate package