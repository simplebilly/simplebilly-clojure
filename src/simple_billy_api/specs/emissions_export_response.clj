(ns simple-billy-api.specs.emissions-export-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def emissions-export-response-data
  {
   (ds/req :csv_content) string?
   (ds/req :filename) string?
   })

(def emissions-export-response-spec
  (ds/spec
    {:name ::emissions-export-response
     :spec emissions-export-response-data}))
