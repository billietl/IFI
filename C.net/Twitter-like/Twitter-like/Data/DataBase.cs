using System;
using System.Collections.Generic;
using System.Data.Linq;
using System.Linq;
using System.Web;

namespace Twitter_like.Data
{
    public partial class DataBase : DataContext
    {
        public Table<Utilisateur> utilisateurs;
        public Table<Message> messages;
        public DataBase(string connection) : base(connection) { }
    }
}