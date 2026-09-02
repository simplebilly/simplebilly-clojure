(ns simple-billy-api.specs.go-bd-export-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def go-bd-export-response-data
  {
   (ds/req :booking_count) int?
   (ds/req :csv_content) string?
   (ds/req :filename) string?
   })

(def go-bd-export-response-spec
  (ds/spec
    {:name ::go-bd-export-response
     :spec go-bd-export-response-data}))
