4JVA_SupRails_WS
================

Simple JEE Application with SOAP and Rest Web services.

NetBeans 7.4 with GlassFish Server 3.1.2 (not working with GlassFish 4.0)


How-to :

1 - Clone repo<br/>
2 - Open project with NetBeans (unline Eclipse, no need to import, juste "File - Open project")<br/>
3 - Make sure your database is running (WAMP/MAMP)<br/>
4 - Create a [datasource](http://itsolutionsforall.com/datasource_jpa.php) on GlassFish (http://localhost:4848/)<br/>
5 - Edit "persistence.xml" file if needed ("Configuration File" or "SupRailsWS/src/conf" directory)


Login : admin<br/>
Password : admin

-----------------------

Test SOAP WebService :

* With NetBeans, launch the projet and right-click on "TripResourcesSOAP" file under "Web Services" folder on the left of your screen - Then "Test Web Service".
* Or go to : http://<SERVER>:8080/SupRailsWS/TripResourceSOAPService?Tester

Test REST WebService :

* Do GET or POST request on this URL : 
http://<SERVER>:8080/SupRailsWS/resources/rest/trips

Java rocks.
