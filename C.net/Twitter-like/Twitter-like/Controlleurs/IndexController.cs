using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Twitter_like.Controlleurs
{
    public class indexController : Controller
    {
        //
        // GET: /index
        public ViewResult Render()
        {
            return View("Index");
        }
	}
}