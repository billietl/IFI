using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Twitter_like.Controlleurs
{
    public class signupController : Controller
    {
        //
        // GET: /FormInscription/
        public ActionResult Index()
        {
            return View("Signup");
        }
	}
}