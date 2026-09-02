(ns simple-billy-api.specs.gdpr-tenant
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-tenant-data
  {
   (ds/req :name) string?
   (ds/req :role) string?
   (ds/req :tenantId) uuid?
   })

(def gdpr-tenant-spec
  (ds/spec
    {:name ::gdpr-tenant
     :spec gdpr-tenant-data}))
