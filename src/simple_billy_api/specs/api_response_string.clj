(ns simple-billy-api.specs.api-response-string
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def api-response-string-data
  {
   (ds/opt :data) string?
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-string-spec
  (ds/spec
    {:name ::api-response-string
     :spec api-response-string-data}))
