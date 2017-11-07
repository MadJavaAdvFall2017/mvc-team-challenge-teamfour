<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2//EN">

<html>
    <head>
        <meta name="generator" content="HTML Tidy, see www.w3.org">
        <title>Team Four MVC</title>
        <link rel="stylesheet" type="text/css" href="css/styleSheet.css">

    </head>

    <body>
        <header>
            <h1>Team Four MVC</h1>
        </header>
        <div>
        <form action="question">

            <label id="team1" name="team1">Which of the following holds a group of objects in the same order that they are placed in the collection?</label><br/>
            <input type="radio" id="team1" name="team1" value="TreeMap">TreeMap<br/>
            <input type="radio" id="team1" name="team1" value="TreeSet">TreeSet<br/>
            <input type="radio" id="team1" name="team1" value="HashMap">HashMap<br/>
            <input type="radio" id="team1" name="team1" value="array">arrayList<br/>


            <br/><br/>

            <label id="team2" name="team2">THE PRINTWRITER CLASS IS PART OF WHICH PACKAGE?</label><br/>
            <input type="radio" id="team2" name="team2" value="Noimport">No import is necessary<br/>
            <input type="radio" id="team2" name="team2" value="javaLang">java.lang.*;<br/>
            <input type="radio" id="team2" name="team2" value="javaUtil">java.util.*;<br/>
            <input type="radio" id="team2" name="team2" value="javaCollection*">java.collections.*;<br/>
            <input type="radio" id="team2" name="team2" value="javaIo">java.io.*; <br/>

            <br/><br/>


            <label id="team3" name="team3">SERVLETS ARE:</label><br/>
            <input type="radio" id="team3" name="team3" value="servletOne">Part of the javax.transaction and javax.transaction.xa packages<br/>
            <input type="radio" id="team3" name="team3" value="servletTwo">Part of the java.io and java.util packages<br/>
            <input type="radio" id="team3" name="team3" value="servletThree">java.io.*<br/>
            <input type="radio" id="team3" name="team3" value="servletFour">Part of the javax.servlet and javax.servlet.http packages; <br/>

            <br/><br/>


            <label id="team4" name="team4">How many ways we can send HTTP request to the servlet?</label><br/>
            <input type="radio" id="team4" name="team4" value="1">GET_METHOD<br/>
            <input type="radio" id="team4" name="team4" value="2">POST_METHOD<br/>
            <input type="radio" id="team4" name="team4" value="3">BOTH<br/>


            <br /><input type="submit" value="Submit">

        </form>
        </div>
        <footer>
            <img src="<%=request.getContextPath()%>/images/mvc.jpg" /></a>
            <img src="<%=request.getContextPath()%>/images/TeamFourMVC.jpg" /></a>

        </footer>


    </body>
</html>