(ns simple-billy-api.specs.datev-export-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def datev-export-response-data
  {
   (ds/req :booking_count) int?
   (ds/req :csv_content) string?
   (ds/req :filename) string?
   })

(def datev-export-response-spec
  (ds/spec
    {:name ::datev-export-response
     :spec datev-export-response-data}))
