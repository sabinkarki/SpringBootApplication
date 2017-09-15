<h2>Description</h2>
<pre>
This demo project handles multiple object.
1.By creating wrapper object.
2.By using ObjectMapper and JsonNode
</pre>

<h2>System Requirements</h2>
1.IDE(STS, Intellij)
2.lombok
3.SpringBoot
4.PostMan
5.Jackson

<h2>EndPoints:</h2>
<pre>
http://localhost:8080/withWraperObject
o/p 
{
    "id": 1,
    "name": "sabin"
}
</pre>
<pre>
http://localhost:8080/withmultipleObject
o/p
{
    "id": 1,
    "name": "Nikita"
}
</pre>

<h2>Sample Json</h2>
<pre>
{
  "user":{
  "id":1,
  "name":"sabin"
  },
  "address":{
  "id":1,
  "name":"Nikita"
  }
}
</pre>