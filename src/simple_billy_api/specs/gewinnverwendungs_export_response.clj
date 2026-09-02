(ns simple-billy-api.specs.gewinnverwendungs-export-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gewinnverwendungs-export-response-data
  {
   (ds/req :csv_content) string?
   (ds/req :filename) string?
   })

(def gewinnverwendungs-export-response-spec
  (ds/spec
    {:name ::gewinnverwendungs-export-response
     :spec gewinnverwendungs-export-response-data}))
