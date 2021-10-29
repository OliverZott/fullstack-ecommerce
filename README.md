# Startup
- **Tomcat** ...don't start (IntelliJ starts it for port 8080)
- **MySQL Server** ... start:
  - Linux: `opt/lamp/lamp start`
  - Windows: In Services start **MySql80**
- Start Frontend `ng serve`

# Rest API
- Implement Rest-API: See `7d5fc8fd`  ... only implementation of **JpaRepository** abstract-class necessary.
- Configure Rest-API: See `56f5c71a`  ... configuration for endpoint exposure (no security yet).