using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Twitter_like.Vues
{
    public partial class login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void Connect_Button_Click(object sender, EventArgs e)
        {
            if (/*Utilisateur.exists*/false)
            {
                /* ouverture session */
            }
            else
            {
                /* affichage message erreur */
                error_text.InnerText = "Impossible de vous connecter. D&eacute;sol&eacute; !";
            }
        }
    }
}