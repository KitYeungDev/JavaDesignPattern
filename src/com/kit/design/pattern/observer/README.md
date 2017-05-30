Observer Pattern
---
Define one-to-many dependence relationship between objects so that when a object status changed , its all observer will receive notification and update data.

- Defines a one-to-many relationship between objects
- Subject (that is observable) use a same interface to update observer.
- between subject and observer used loose coupling way , subject don't know the detail of observer , just know observser implement subject's interface .
- When there are multiple observer , you can not rely on a specific notification order .