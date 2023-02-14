![hero](https://user-images.githubusercontent.com/24255551/218847964-f008f2fa-1aa0-41cf-844b-c4100cac420d.png)

SqlBuilder is Java librairie who enables you to simply create with a elegant way a Sql query

---

### Links:
 * Doc
 * Code Quality

---

### Easy to use
```java
SqlBuilder.select("nom", "prenom")
       .from("users")
       .where("nom = Jean")
       .where("prenom = Pierre")
       .orderBy("nom", OrderByCommand.Order.ASC)
       .limit(5)
       .build()
```
