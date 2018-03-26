## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=[DebugLevel Value]

-----------------------------------------------------------------------


My Assignments output is based on following calculation:

1) Total number of travelers(total number of travelers since day one, not for current day)
2) Total number of days
3) Total number of prohibited items(total number of prohibited items since day one, not from current day)

4) Average Traffic Per Day = Total number of travelers ÷ Total number of days
5) Average Prohibited Items Per Day = Total number of prohibited items ÷ Total number of days


