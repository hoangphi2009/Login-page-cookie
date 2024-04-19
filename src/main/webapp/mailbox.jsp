<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/mailbox/" method="post">
    <h1>welcome</h1>
    <table>
        <tr>
            <td>Your Name</td>
            <td><input type="text" name="firstname"></td>
            <td><input type="text" name="lastname"></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><input type="radio" name="gender" value="Female" checked>Male</td>
            <td><input type="radio" name="gender" value="Female" checked>Female</td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td>
                <select name="days" id="days">
                    <option value="day">1</option>
                    <option value="day">2</option>
                    <option value="day">3</option>
                    <option value="day">4</option>
                    <option value="day">5</option>
                    <option value="day">6</option>
                    <option value="day">7</option>
                    <option value="day">8</option>
                    <option value="day">9</option>
                    <option value="day">10</option>
                    <option value="day">11</option>
                    <option value="day">12</option>
                    <option value="day">13</option>
                    <option value="day">14</option>
                    <option value="day">15</option>
                    <option value="day">16</option>
                    <option value="day">17</option>
                    <option value="day">18</option>
                    <option value="day">19</option>
                    <option value="day">20</option>
                    <option value="day">21</option>
                    <option value="day">22</option>
                    <option value="day">23</option>
                    <option value="day">24</option>
                    <option value="day">25</option>
                    <option value="day">26</option>
                    <option value="day">27</option>
                    <option value="day">28</option>
                    <option value="day">29</option>
                    <option value="day">30</option>
                    <option value="day">32</option>
                </select>
            </td>
            <td>
                <select name="month" id="month">
                    <option value="January">January</option>
                    <option value="February">February</option>
                    <option value="March">March</option>
                    <option value="April">April</option>
                    <option value="May">May</option>
                    <option value="June">June</option>
                    <option value="July">July</option>
                    <option value="August">August</option>
                    <option value="September">September</option>
                    <option value="October">October</option>
                    <option value="November">November</option>
                    <option value="December">December</option>
                </select>
            </td>
            <td>
                <select name="year" id="year">
                    <option value="2000">2000</option>
                    <option value=2001"">2001</option>
                    <option value="2002">2002</option>
                    <option value="2003">2003</option>
                    <option value="2004">2004</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Your Major</td>
            <td>
                <select name="major">
                    <option value="IT">Information Technology</option>
                    <option value="CS">Computer Science</option>
                    <option value="CE">Computer Engineer</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>I live in</td>
            <td>
                <select name="country">
                    <option value="Vietnam">Vietnam</option>
                    <option value="US">US</option>
                    <option value="UK">UK</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>SelectID</td>
            <td><input type="text" name="id"></td>
            <td>
                <select name="domain">
                    <option value="gmail">@gmail</option>
                    <option value="email">@student.hcmiu.edu.vn</option>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="submit"></td>
            <td><input type="reset" value="reset"></td>
        </tr>
    </table>
</form>

</body>
</html>
