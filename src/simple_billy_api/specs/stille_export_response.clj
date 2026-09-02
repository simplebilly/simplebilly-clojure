(ns simple-billy-api.specs.stille-export-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def stille-export-response-data
  {
   (ds/req :csv_content) string?
   (ds/req :filename) string?
   })

(def stille-export-response-spec
  (ds/spec
    {:name ::stille-export-response
     :spec stille-export-response-data}))
