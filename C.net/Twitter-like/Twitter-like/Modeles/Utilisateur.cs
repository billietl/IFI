﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Twitter_like.Data;

namespace Twitter_like.Modeles
{
    public class Utilisateur
    {
        public static bool exists(Utilisateur u)
        {
            return false;
        }

        public static bool is_login_ok(String pseudo, String password)
        {
            return false;
        }
    }
}