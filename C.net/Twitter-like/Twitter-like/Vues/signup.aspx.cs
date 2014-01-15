using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Twitter_like.Vues
{
    public partial class signup : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Connect_Button_Click(object sender, EventArgs e)
        {
            if(/* le pseudo est déjà pris */false){
                error_text.InnerText = "Ce pseudo est déjà pris. D&eacute;sol&eacute; !";
            }
            else if(passwd_TextBox.Text.Equals(passwd2_TextBox.Text))
            {
                error_text.InnerText = "Les mots de passe ne correspondent pas. D&eacute;sol&eacute; !";
            }
            else
            {

            }
        }
    }
}