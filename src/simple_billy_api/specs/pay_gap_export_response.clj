(ns simple-billy-api.specs.pay-gap-export-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pay-gap-export-response-data
  {
   (ds/req :csv_content) string?
   (ds/req :filename) string?
   })

(def pay-gap-export-response-spec
  (ds/spec
    {:name ::pay-gap-export-response
     :spec pay-gap-export-response-data}))
