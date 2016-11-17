all:	once


once: 	
	pdflatex -halt-on-error essay_1.tex > /dev/null
	
alert: 	
	pdflatex -halt-on-error essay_1.tex
	
clean: 
	rm *.log *.nlo *.idx *.aux *.toc *.out *.blg *.run.xml *.bbl *.bcf

biber:
	make once
	biber report
	make once
	make once
	make clean

tidy:
	make once
	make clean
