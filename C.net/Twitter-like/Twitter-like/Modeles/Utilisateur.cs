using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Web;
using Twitter_like.Data;

namespace Twitter_like.Modeles
{
    public class Utilisateur
    {
        private string CreateMD5Hash(string input)
        {
            // Use input string to calculate MD5 hash
            MD5 md5 = System.Security.Cryptography.MD5.Create();
            byte[] inputBytes = System.Text.Encoding.ASCII.GetBytes(input);
            byte[] hashBytes = md5.ComputeHash(inputBytes);

            // Convert the byte array to hexadecimal string
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hashBytes.Length; i++)
            {
                sb.Append(hashBytes[i].ToString("X2")); 
            }
            return sb.ToString();
        }
        public static bool exists(Utilisateur u)
        {
            return false;
        }

        public static bool is_login_ok(String pseudo, String password)
        {
            return false;
        }

        public Utilisateur(String pseudo, String password)
        {

        }
    }
}