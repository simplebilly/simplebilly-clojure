(ns simple-billy-api.specs.user-tenant-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-tenant-info-data
  {
   (ds/opt :custom_domain) string?
   (ds/req :role) string?
   (ds/opt :subdomain) string?
   (ds/req :tenant_id) uuid?
   (ds/req :tenant_name) string?
   })

(def user-tenant-info-spec
  (ds/spec
    {:name ::user-tenant-info
     :spec user-tenant-info-data}))
