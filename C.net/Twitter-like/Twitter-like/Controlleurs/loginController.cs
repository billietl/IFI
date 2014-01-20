using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Twitter_like.Controlleurs
{
    public class loginController : Controller
    {
        //
        // GET: /login/
        public ActionResult Index()
        {
            return View("Login");
        }
	}
}