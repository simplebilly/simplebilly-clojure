(ns simple-billy-api.specs.api-response-vec-user-tenant-info-data-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def api-response-vec-user-tenant-info-data-inner-data
  {
   (ds/opt :custom_domain) string?
   (ds/req :role) string?
   (ds/opt :subdomain) string?
   (ds/req :tenant_id) uuid?
   (ds/req :tenant_name) string?
   })

(def api-response-vec-user-tenant-info-data-inner-spec
  (ds/spec
    {:name ::api-response-vec-user-tenant-info-data-inner
     :spec api-response-vec-user-tenant-info-data-inner-data}))
