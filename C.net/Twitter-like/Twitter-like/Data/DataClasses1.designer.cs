﻿#pragma warning disable 1591
//------------------------------------------------------------------------------
// <auto-generated>
//     Ce code a été généré par un outil.
//     Version du runtime :4.0.30319.18408
//
//     Les modifications apportées à ce fichier peuvent provoquer un comportement incorrect et seront perdues si
//     le code est régénéré.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Twitter_like.Data
{
	using System.Data.Linq;
	using System.Data.Linq.Mapping;
	using System.Data;
	using System.Collections.Generic;
	using System.Reflection;
	using System.Linq;
	using System.Linq.Expressions;
	using System.ComponentModel;
	using System;
	
	
	public partial class DataClasses1DataContext : System.Data.Linq.DataContext
	{
		
		private static System.Data.Linq.Mapping.MappingSource mappingSource = new AttributeMappingSource();
		
    #region Définitions de méthodes d'extensibilité
    partial void OnCreated();
    partial void InsertUtilisateur(Utilisateur instance);
    partial void UpdateUtilisateur(Utilisateur instance);
    partial void DeleteUtilisateur(Utilisateur instance);
    partial void InsertMessage(Message instance);
    partial void UpdateMessage(Message instance);
    partial void DeleteMessage(Message instance);
    #endregion
		
		public DataClasses1DataContext(string connection) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public DataClasses1DataContext(System.Data.IDbConnection connection) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public DataClasses1DataContext(string connection, System.Data.Linq.Mapping.MappingSource mappingSource) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public DataClasses1DataContext(System.Data.IDbConnection connection, System.Data.Linq.Mapping.MappingSource mappingSource) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public System.Data.Linq.Table<Utilisateur> Utilisateur
		{
			get
			{
				return this.GetTable<Utilisateur>();
			}
		}
		
		public System.Data.Linq.Table<Message> Message
		{
			get
			{
				return this.GetTable<Message>();
			}
		}
	}
	
	[global::System.Data.Linq.Mapping.TableAttribute(Name="")]
	public partial class Utilisateur : INotifyPropertyChanging, INotifyPropertyChanged
	{
		
		private static PropertyChangingEventArgs emptyChangingEventArgs = new PropertyChangingEventArgs(String.Empty);
		
		private string _ID = default(string);
		
		private string _password;
		
		private string _pseudo;
		
		private EntityRef<Message> _Message;
		
    #region Définitions de méthodes d'extensibilité
    partial void OnLoaded();
    partial void OnValidate(System.Data.Linq.ChangeAction action);
    partial void OnCreated();
    partial void OnpasswordChanging(string value);
    partial void OnpasswordChanged();
    partial void OnpseudoChanging(string value);
    partial void OnpseudoChanged();
    #endregion
		
		public Utilisateur()
		{
			this._Message = default(EntityRef<Message>);
			OnCreated();
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_ID", CanBeNull=false, IsPrimaryKey=true, IsDbGenerated=true, UpdateCheck=UpdateCheck.Never)]
		public string ID
		{
			get
			{
				return this._ID;
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_password", CanBeNull=false)]
		public string password
		{
			get
			{
				return this._password;
			}
			set
			{
				if ((this._password != value))
				{
					this.OnpasswordChanging(value);
					this.SendPropertyChanging();
					this._password = value;
					this.SendPropertyChanged("password");
					this.OnpasswordChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_pseudo", CanBeNull=false)]
		public string pseudo
		{
			get
			{
				return this._pseudo;
			}
			set
			{
				if ((this._pseudo != value))
				{
					this.OnpseudoChanging(value);
					this.SendPropertyChanging();
					this._pseudo = value;
					this.SendPropertyChanged("pseudo");
					this.OnpseudoChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.AssociationAttribute(Name="Message_Utilisateur", Storage="_Message", ThisKey="ID", OtherKey="proprietaire", IsForeignKey=true)]
		public Message Message
		{
			get
			{
				return this._Message.Entity;
			}
			set
			{
				Message previousValue = this._Message.Entity;
				if (((previousValue != value) 
							|| (this._Message.HasLoadedOrAssignedValue == false)))
				{
					this.SendPropertyChanging();
					if ((previousValue != null))
					{
						this._Message.Entity = null;
						previousValue.Utilisateur.Remove(this);
					}
					this._Message.Entity = value;
					if ((value != null))
					{
						value.Utilisateur.Add(this);
						this._ID = value.proprietaire;
					}
					else
					{
						this._ID = default(string);
					}
					this.SendPropertyChanged("Message");
				}
			}
		}
		
		public event PropertyChangingEventHandler PropertyChanging;
		
		public event PropertyChangedEventHandler PropertyChanged;
		
		protected virtual void SendPropertyChanging()
		{
			if ((this.PropertyChanging != null))
			{
				this.PropertyChanging(this, emptyChangingEventArgs);
			}
		}
		
		protected virtual void SendPropertyChanged(String propertyName)
		{
			if ((this.PropertyChanged != null))
			{
				this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
			}
		}
	}
	
	[global::System.Data.Linq.Mapping.TableAttribute(Name="")]
	public partial class Message : INotifyPropertyChanging, INotifyPropertyChanged
	{
		
		private static PropertyChangingEventArgs emptyChangingEventArgs = new PropertyChangingEventArgs(String.Empty);
		
		private string _ID;
		
		private string _contenu;
		
		private string _proprietaire;
		
		private EntitySet<Utilisateur> _Utilisateur;
		
    #region Définitions de méthodes d'extensibilité
    partial void OnLoaded();
    partial void OnValidate(System.Data.Linq.ChangeAction action);
    partial void OnCreated();
    partial void OnIDChanging(string value);
    partial void OnIDChanged();
    partial void OncontenuChanging(string value);
    partial void OncontenuChanged();
    partial void OnproprietaireChanging(string value);
    partial void OnproprietaireChanged();
    #endregion
		
		public Message()
		{
			this._Utilisateur = new EntitySet<Utilisateur>(new Action<Utilisateur>(this.attach_Utilisateur), new Action<Utilisateur>(this.detach_Utilisateur));
			OnCreated();
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_ID", CanBeNull=false, IsPrimaryKey=true)]
		public string ID
		{
			get
			{
				return this._ID;
			}
			set
			{
				if ((this._ID != value))
				{
					this.OnIDChanging(value);
					this.SendPropertyChanging();
					this._ID = value;
					this.SendPropertyChanged("ID");
					this.OnIDChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_contenu", CanBeNull=false)]
		public string contenu
		{
			get
			{
				return this._contenu;
			}
			set
			{
				if ((this._contenu != value))
				{
					this.OncontenuChanging(value);
					this.SendPropertyChanging();
					this._contenu = value;
					this.SendPropertyChanged("contenu");
					this.OncontenuChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_proprietaire", CanBeNull=false)]
		public string proprietaire
		{
			get
			{
				return this._proprietaire;
			}
			set
			{
				if ((this._proprietaire != value))
				{
					this.OnproprietaireChanging(value);
					this.SendPropertyChanging();
					this._proprietaire = value;
					this.SendPropertyChanged("proprietaire");
					this.OnproprietaireChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.AssociationAttribute(Name="Message_Utilisateur", Storage="_Utilisateur", ThisKey="proprietaire", OtherKey="ID")]
		public EntitySet<Utilisateur> Utilisateur
		{
			get
			{
				return this._Utilisateur;
			}
			set
			{
				this._Utilisateur.Assign(value);
			}
		}
		
		public event PropertyChangingEventHandler PropertyChanging;
		
		public event PropertyChangedEventHandler PropertyChanged;
		
		protected virtual void SendPropertyChanging()
		{
			if ((this.PropertyChanging != null))
			{
				this.PropertyChanging(this, emptyChangingEventArgs);
			}
		}
		
		protected virtual void SendPropertyChanged(String propertyName)
		{
			if ((this.PropertyChanged != null))
			{
				this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
			}
		}
		
		private void attach_Utilisateur(Utilisateur entity)
		{
			this.SendPropertyChanging();
			entity.Message = this;
		}
		
		private void detach_Utilisateur(Utilisateur entity)
		{
			this.SendPropertyChanging();
			entity.Message = null;
		}
	}
}
#pragma warning restore 1591
