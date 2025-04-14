# Modello ToDo Homework

Un progetto Java per la gestione di attività e liste di cose da fare (ToDo). Questo programma è attualmente in una fase embrionale e serve come modello per un'applicazione di gestione delle attività.

## Struttura del Progetto

Il progetto è composto dai seguenti componenti principali:

- **Utente**: Rappresenta un utente con un'email, una password e un array di bacheche.
- **Bacheca**: Contiene una lista di ToDo, un titolo, una descrizione e un ordinamento.
- **ToDo**: Rappresenta un'attività con titolo, descrizione, scadenza, stato di completamento e una checklist opzionale.
- **Checklist**: Una lista di attività (oggetti `Attività`) da completare.
- **Attività**: Rappresenta una singola attività con un nome e uno stato di completamento.
- **Titolo**: Enum che definisce i tipi di bacheche (Università, Tempo Libero, Lavoro).
- **Ordinamento**: Enum che definisce i criteri di ordinamento per i ToDo.

## Funzionalità

- Creazione di attività (`Attività`) e checklist (`Checklist`).
- Creazione di ToDo con dettagli come titolo, descrizione, scadenza e checklist.
- Organizzazione dei ToDo in bacheche (`Bacheca`) con ordinamenti personalizzati.
- Gestione degli utenti con bacheche personali.

## Esempio di Utilizzo

Il file `Programma.java` contiene un esempio di utilizzo del progetto:

1. Creazione di attività e checklist.
2. Creazione di ToDo e aggiunta a una bacheca.
3. Creazione di un utente con bacheche.
4. Stampa di un'attività partendo dall'utente.

Esempio di output:
Attività: comprare il latte

## Prossimi Passi

1. un check per verificare se è una email
2. metodo di crypt per la password