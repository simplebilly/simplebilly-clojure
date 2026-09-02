(ns simple-billy-api.specs.peppol-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def peppol-response-data
  {
   (ds/req :content) string?
   (ds/req :content_type) string?
   (ds/req :filename) string?
   })

(def peppol-response-spec
  (ds/spec
    {:name ::peppol-response
     :spec peppol-response-data}))
