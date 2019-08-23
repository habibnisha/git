set projectLocation=C:\Users\Admin\eclipse-workspace\Modular framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
