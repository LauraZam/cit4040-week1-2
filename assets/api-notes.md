# API Study Notes: REST Countries API Family

## 1. Selected Endpoints and Their Responses

* **Endpoint 1: Countries API Search (`/countries/v5`)** 
    * **What it returns:** Structured and normalized data for every country, returning over 90 fields in all including names, ISO codes, capitals, currencies, languages, flags, borders, geography, and political leaders.
* **Endpoint 2: Favicon CDN (`/v1/{domain}`)**  
    * **What it returns:** Takes a domain and returns that site's favicon as an images. A domain with no icon comes back as a fallback image rather than an error.
* **Endpoint 3: Flag CDN (`/v5/{width}/{country_code}.png`)**  
    * **What it returns:** Serves country flag images across 254 flags in PNG, JPG, GIF, and SVG formats, with raster widths ranging from `w160` through `w2560`.

## 2. HTTP Methods and Rationale

* **HTTP Method:** These endpoints utilize **`GET`** (or standard HTTP GET behavior for retrieving resources/assets via URL/CDN).
* **Why this choice makes sense:** The REST Countries family consists of read-only HTTP APIs and CDNs designed to fetch reference data and static assets without modifying server state. The `GET` method is semantically designed for safe, idempotent data retrieval.


## 3. Behavior for Non-Existent Resources

According to the documentation:
* **For CDNs:** A domain with no icon comes back as a fallback image rather than an error, ensuring that image tags never render broken.
* **For APIs:** When requests cross limits or access invalid states, the API responds with standard error codes like `429 Too Many Requests` when exceeding throughput ceilings, or `403 Forbidden` if an account is frozen after a grace period.
