(ns simple-billy-api.specs.konzern-export-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def konzern-export-response-data
  {
   (ds/req :csv_content) string?
   (ds/req :filename) string?
   })

(def konzern-export-response-spec
  (ds/spec
    {:name ::konzern-export-response
     :spec konzern-export-response-data}))
