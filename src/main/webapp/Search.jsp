<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>searh Results</title>
</head>
<body>



    <form class="searchBox" action=SEARCH method = post >

        <input class="searchInput" type="text" placeholder="Search" name="search">
        <button type="search" class="searchButton" >
            <i class="material-icons">
                search
            </i></button>
        </input>
    </form>

<!-- <form class="example" action="SEARCH" method = "POST">
  <input type="text" placeholder="Search Doctor..." name="search">
  <button type="submit"><i class="fa fa-search"></i></button>
</form> -->

<!-- Script for Sidebar, Tabs, Accordions, Progress bars and slideshows -->
<style>
body {
    background-image: linear-gradient(to right , #cb2d3e , #ef473a);
}

.searchBox {
    position: absolute;
    top: 50%;
    left: 50%;
    transform:  translate(-50%,50%);
    background: #2f3640;
    height: 40px;
    border-radius: 40px;
    padding: 10px;

}

.searchBox:hover > .searchInput {
    width: 240px;
    padding: 0 6px;
}

.searchBox:hover > .searchButton {
  background: white;
  color : #2f3640;
}

.searchButton {
    color: white;
    float: right;
    width: 40px;
    height: 40px;
    border-radius: 50%;
    background: #2f3640;
    display: flex;
    justify-content: center;
    align-items: center;
    transition: 0.4s;
}

.searchInput {
    border:none;
    background: none;
    outline:none;
    float:left;
    padding: 0;
    color: white;
    font-size: 16px;
    transition: 0.4s;
    line-height: 40px;
    width: 0px;

}

@media screen and (max-width: 620px) {
.searchBox:hover > .searchInput {
    width: 150px;
    padding: 0 6px;
}
}
</style>

</body>
</html>