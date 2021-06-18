###### Progetto che si connette ad un database MySQL e che utilizza Data JPA di Spring.

**Annotazione @OneToMany**
Questo e' opzionale e non crea nessun campo sul database, ma permette di recuterare tutti gli utenti collegati
E' possibile utilizzare anche altri attributi nella dichiarazione dell'annotazione:
@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,  mappedBy = "ente", orphanRemoval = true)
L'annotazione @JoinColumn puo' essere sostituita dall'attributo mappedBy.

```
@OneToMany(fetch = FetchType.LAZY, mappedBy = "ente")
private List<Test> listTest = new ArrayList();
```

**Annotazione @Embedded**
E' possibile suddividere una tabella del database in piu' classi attraverso l'annotazione @Embedded

```
@Embedded
private EnteInfo enteInfo;
```

**Annotazione @Embeddable**
E' possibile suddividere una tabella del database in piu' classi, sulla classe da inglobare va posta questa annotazione

```
@Embeddable
@Access(AccessType.FIELD)
public class EnteInfo implements Serializable {
```

**Annotazione @GeneratedValue(strategy = GenerationType.AUTO)**    
Crea una tabella separata 'hibernate_sequence' dove viene salvato l'ID da utilizzare

```    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
```

**Annotazione @TableGenerator**
Crea una tabella separata 'progressivi' dove viene salvato l'ID da utilizzare
In questo modo e' possibile aggiungere nella tabella 'progressivi' piu' contatori anche di altre tabelle

```
@Id
@TableGenerator(
        name = "ruolo2",
        table = "progressivi",
        pkColumnName = "tipo",
        valueColumnName = "progressivo",
        allocationSize = 100
)
```

**Annotazione @OneToOne**
    
@PrimaryKeyJoinColumn: usato assieme a @OneToOne sull'oggetto principale,
indica che la foreign key è la stessa chiave primaria (ovvero, le due tabelle possiedono la stessa chiave primaria)
Non conviene utilizzare nella tabella collegata una autoincrement ma la chiave andrebbe condivisa pertanto ci sarebbero problemi.

```
@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
@PrimaryKeyJoinColumn
private ElementoSecondo elemento2;
```
