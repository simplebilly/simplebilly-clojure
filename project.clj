(defproject simple-billy-api "0.1.0"
  :description "Simplebilly API - Bookkeeping, CRM, ERP. Multi-tenant API: a tenant is isolated and routed by subdomain (or a configured custom domain) under the base domain.

## Rate limiting
All endpoints are rate-limited per client IP: **100 requests per minute** on API routes and **5 requests per minute** on authentication routes. Exceeding a limit returns `429 Too Many Requests`; the window resets after 60 seconds."
  :url "https://simplebilly.com/en/legal/imprint"
  :license {:name "Apache-2.0"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [metosin/spec-tools "0.7.0"]
                 [clj-http "3.8.0"]
                 [orchestra "2017.11.12-1"]
                 [cheshire "5.8.0"]])