<html>
<head>
<title>REST API Lab</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<h2>REST API Lab</h2>
	<h3>Resource 1: Contacts</h3>
	<h4>URL Endpoints:</h4>
	<ul>
		<li>GET /restlab/resources/contacts - gets all contacts</li>
		<li>GET /restlab/resources/contacts/{contactId} - gets the contact with an
			ID of {contactId}</li>
		<li>POST /restlab/resources/contacts - creates a new contact</li>
		<li>PUT /restlab/resources/contacts/{contactId} - updates an existing
			contact with an ID of {contactId}</li>
		<li>DELETE /restlab/resources/contacts/{contactId} - deletes an existing
			contact with an ID of {contactId}</li>
	</ul>
	<h4>Sample Requests</h4>
	<table class="table">
		<tr>
			<th>HTTP Method</th>
			<th>URL</th>
			<th>Request Body</th>
			<th>Response Code</th>
			<th>Response Body</th>
		</tr>
		<tr>
			<td>GET</td>
			<td>/restlab/resources/contacts</td>
			<td>n/a</td>
			<td>200 OK</td>
			<td>JSON representation of all contacts</td>
		</tr>
		<tr>
			<td>GET</td>
			<td>/restlab/resources/contacts/1</td>
			<td>n/a</td>
			<td>200 OK</td>
			<td>JSON representation of the contact with an id=1</td>
		</tr>
		<tr>
			<td>GET</td>
			<td>/restlab/resources/contacts/4</td>
			<td>n/a</td>
			<td>404 Not Found</td>
			<td>A 'not found' message</td>
		</tr>
		<tr>
			<td>POST</td>
			<td>/restlab/resources/contacts/4</td>
			<td>{ "name": "Jim James", "phonenumber": "555-123-1234",
				"emailaddress": "jim.james@restlab.com"}</td>
			<td>405 Method Not Allowed</td>
			<td>n/a</td>
		</tr>
		<tr>
			<td>POST</td>
			<td>/restlab/resources/contacts</td>
			<td>{ "name": "Jim James", "phonenumber": "555-123-1234",
				"emailaddress": "jim.james@restlab.com"}</td>
			<td>400 Bad Request</td>
			<td>An error message explaining that the 'phonenumber' field is
				not recognized. The JSON submitted is invalid.</td>
		</tr>
		<tr>
			<td>POST</td>
			<td>/restlab/resources/contacts</td>
			<td>{ "name": "Jim James", "phone": "555-123-1234", "email":
				"jim.james@restlab.com"}</td>
			<td>201 Created</td>
			<td>A JSON representation of the newly created contact,
				including the contact id.</td>
		</tr>
		<tr>
			<td>PUT</td>
			<td>/restlab/resources/contacts/4</td>
			<td>{ "id": "4", "name": "Yim Yames", "phone": "555-123-1234",
				"email": "yim.yames@restlab.com"}</td>
			<td>200 OK</td>
			<td>n/a</td>
		</tr>
		<tr>
			<td>DELETE</td>
			<td>/restlab/resources/contacts/2</td>
			<td>n/a</td>
			<td>200 OK</td>
			<td>n/a</td>
		</tr>
	</table>
	
	
	
	<h3>Resource 2: Events</h3>
	<h4>URL Endpoints:</h4>
	<ul>
		<li>GET /restlab/resources/events - gets all events</li>
		<li>GET /restlab/resources/events/{eventId} - gets the event with an
			ID of {eventId}</li>
		<li>POST /restlab/resources/events - creates a new contact</li>
		<li>PUT /restlab/resources/events/{eventId} - updates an existing
			event with an ID of {eventId}</li>
		<li>DELETE /restlab/resources/events/{eventId} - deletes an existing
			event with an ID of {eventId}</li>
	</ul>
	<h4>Sample Requests</h4>
	<table class="table">
		<tr>
			<th>HTTP Method</th>
			<th>URL</th>
			<th>Request Body</th>
			<th>Response Code</th>
			<th>Response Body</th>
		</tr>
		<tr>
			<td>GET</td>
			<td>/restlab/resources/events</td>
			<td>n/a</td>
			<td>200 OK</td>
			<td>JSON representation of all events</td>
		</tr>
		<tr>
			<td>GET</td>
			<td>/restlab/resources/events/3</td>
			<td>n/a</td>
			<td>200 OK</td>
			<td>JSON representation of the event with an id=3</td>
		</tr>
		<tr>
			<td>POST</td>
			<td>/restlab/resources/events</td>
			<td>{"description":"basketball game",
				"startTime":"2016-07-08T18:00:00-04:00",
				"endTime":"2016-07-01T19:30:00-04:00",
				"location":"rec center"}</td>
			<td>201 Created</td>
			<td>A JSON representation of the newly created event, including the event id.</td>
		</tr>
		<tr>
			<td>POST</td>
			<td>/restlab/resources/events</td>
			<td>{"description":"softball game",
				"startTime":"1468193400000",
				"endTime":"1468198800000",
				"location":"eastern high school"}</td>
			<td>400 Bad Request</td>
			<td>A message explaining that the date format is invalid.</td>
		</tr>
		<tr>
			<td>POST</td>
			<td>/restlab/resources/events</td>
			<td>{"startTime": "07/15/2016 9:00 AM",
			    "endTime": "07/17/2016 3:00 PM",
			    "description": "Vacation",
			    "location": "Lake house"}</td>
			<td>400 Bad Request</td>
			<td>A message explaining that the date format is invalid.</td>
		</tr>
		<tr>
			<td>PUT</td>
			<td>/restlab/resources/events/2a</td>
			<td>{
			    "id": "2",
			    "description": "Project Meeting",
			    "location": "Conference Room 4",
			    "startTime": null,
			    "endTime": null}</td>
			<td>500 Internal Server Error</td>
			<td>The exception causing the 500 response.</td>
		</tr>
	</table>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
