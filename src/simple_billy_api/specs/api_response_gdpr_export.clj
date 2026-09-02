(ns simple-billy-api.specs.api-response-gdpr-export
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.api-response-gdpr-export-data :refer :all]
            )
  (:import (java.io File)))


(def api-response-gdpr-export-data
  {
   (ds/opt :data) api-response-gdpr-export-data-spec
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-gdpr-export-spec
  (ds/spec
    {:name ::api-response-gdpr-export
     :spec api-response-gdpr-export-data}))
