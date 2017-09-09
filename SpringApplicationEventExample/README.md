<h2>This appplication deals with how Event handling is done in spring mvc.</h2>

<pre>
I have created a Custom Event handler called CustomEvent which extends APPlicationEvent.
Also I have created a listener called customListerner by implementing ApplicationListener
which listens to CustomEvent.

In the controller, i.e HomeController, I have injected Event publisher which publishes the CustomEvent whenever the method,getList() is invoked.
</pre>
<h2>URLs</h2>
<pre>
http://localhost:8080/
http://localhost:8080/lst
</pre>