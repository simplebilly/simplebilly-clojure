(ns simple-billy-api.specs.smtp-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.smtp-encryption :refer :all]
            )
  (:import (java.io File)))


(def smtp-config-data
  {
   (ds/req :encryption) smtp-encryption-spec
   (ds/req :from_address) string?
   (ds/opt :from_name) string?
   (ds/req :host) string?
   (ds/req :password) string?
   (ds/req :port) int?
   (ds/opt :timeout_seconds) int?
   (ds/req :username) string?
   })

(def smtp-config-spec
  (ds/spec
    {:name ::smtp-config
     :spec smtp-config-data}))
