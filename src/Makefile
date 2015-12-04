#===================================#
# Grace O'Hair-Sherman (gohairsh)   #
# CMPS 12M     4/9/15               #
# Assignment:  pa1                  #
# Description: Automatically        #
#              compiles program and #
#              creates jar file.    #
# Filename:    Makefile             #
#===================================#
JAVASRC = BestStuffEver.java UIMS.java Conversion.java SItem.java SLItemList.java
SOURCES = README Makefile INPUT $(JAVASRC)
MAINCLASS = BestStuffEver
CLASSES = BestStuffEver.class UIMS.class Conversion.class SItem.class SLItemList.class
JARFILE = BestStuffEver

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)

clean:
	rm -f BestStuffEver BestStuffEver.class UIMS.class Conversion.class SItem.class SLItemList.class

submit:
	submit cmps101-rj.f15 prog01 $(SOURCES)

