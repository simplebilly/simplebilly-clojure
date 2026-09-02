(ns simple-billy-api.specs.api-response-vec-user-tenant-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.api-response-vec-user-tenant-info-data-inner :refer :all]
            )
  (:import (java.io File)))


(def api-response-vec-user-tenant-info-data
  {
   (ds/opt :data) (s/coll-of api-response-vec-user-tenant-info-data-inner-spec)
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-vec-user-tenant-info-spec
  (ds/spec
    {:name ::api-response-vec-user-tenant-info
     :spec api-response-vec-user-tenant-info-data}))
