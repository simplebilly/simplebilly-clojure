(ns simple-billy-api.specs.marketplace-connection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.connector-type :refer :all]
            )
  (:import (java.io File)))


(def marketplace-connection-data
  {
   (ds/req :config) any-type-spec
   (ds/req :connection_id) string?
   (ds/req :connector_type) connector-type-spec
   (ds/req :created_at) inst?
   (ds/req :is_active) boolean?
   (ds/req :label) string?
   (ds/opt :last_sync_at) inst?
   (ds/req :platform) string?
   (ds/opt :platform_user_id) string?
   (ds/opt :scopes) string?
   (ds/opt :shop_domain) string?
   (ds/opt :shop_name) string?
   (ds/opt :sync_status) string?
   (ds/req :tenant_id) uuid?
   (ds/opt :updated_at) inst?
   })

(def marketplace-connection-spec
  (ds/spec
    {:name ::marketplace-connection
     :spec marketplace-connection-data}))
