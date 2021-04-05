<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gallery</title>
    </head>

    <style>
        .header, .form{
            width: 100%;
            display: flex;
            justify-content: center;
        }
        .gallery img{
            max-width: 300px;
        }
    </style>
    <body>
        <div class="header">

            <h1>GALLERY</h1>


        </div>
        <div class="form">
            <input type="text" id="input" value="<%= request.getParameter("name") == null ? "" : request.getParameter("name")%>"/> 
            <button onclick="search()">Search</button>
        </div>

        <div class="gallery">
            <%-- start web service invocation --%><hr/>
            <%
                try {
                    String name = request.getParameter("name");

                    server.Images service = new server.Images();
                    server.Image port = service.getImagePort();
                    // TODO process result here
                    java.util.List<java.lang.String> result = new ArrayList();
                    if (name == null || name == "") {
                        result = port.getAllImage();
                    } else {
                        result = port.getImage(name);
                    }
                    for (int i = 0; i < result.size(); i++) {
            %>
            <img src="<%= result.get(i)%>.jpg" />
            <%
                    }
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            %>
            <%-- end web service invocation --%><hr/>
        </div>

        <script>
            function search() {
                let name = document.getElementById('input').value;
                window.location.replace(window.location.pathname + '?name=' + name);
            }
        </script>
    </body>
</html>
