#===================================#
# Grace O'Hair-Sherman (gohairsh)   #
# CMPS 12M     4/9/15               #
# Assignment:  pa1                  #
# Description: Automatically        #
#              compiles program and #
#              creates jar file.    #
# Filename:    Makefile             #
#===================================#
JAVASRC = BestStuffEver.java UIMS.java Conversion.java SItem.java SLItemList.java TestDrivers.java
SOURCES = ${JAVASRC} README Makefile INPUT OUTPUT
MAINCLASS = BestStuffEver
CLASSES = ${JAVASRC:.java=.class}
JARCLASSES = ${CLASSES}
JARFILE = ${MAINCLASS}

all: ${JARFILE}

${JARFILE}: ${CLASSES}
	echo Main-class: ${MAINCLASS} >Manifest
	jar cvfm ${JARFILE} Manifest ${JARCLASSES}
	- rm Manifest
	chmod +x ${JARFILE}

%.class : %.java
	- checksource $<
	- cid + $<
	javac $<

${CLASSES}: ${JAVASRC}
	javac -Xlint ${JAVASRC}

clean:
	rm -f BestStuffEver BestStuffEver.class UIMS.class Conversion.class SItem.class SLItemList.class

submit:
	submit cmps101-rj.f15 prog01 ${SOURCES}

