<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="login.aspx.cs" Inherits="Twitter_like.Vues.login" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
</head>
<body>
    <div>
        <span id="error_text" runat="server"></span>
        <form id="form1" runat="server">
            Login :
        <asp:TextBox ID="pseudo_TextBox" runat="server"></asp:TextBox>
            <br />
            Password :
            <asp:TextBox ID="passwd_TextBox" runat="server"></asp:TextBox>
            <br />
            <asp:Button ID="Connect_Button" runat="server" OnClick="Connect_Button_Click" Text="Connexion" />
        </form>
    </div>
</body>
</html>
