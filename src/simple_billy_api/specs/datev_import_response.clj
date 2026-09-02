(ns simple-billy-api.specs.datev-import-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.datev-import-row :refer :all]
            )
  (:import (java.io File)))


(def datev-import-response-data
  {
   (ds/req :count) int?
   (ds/req :filename) string?
   (ds/req :rows) (s/coll-of datev-import-row-spec)
   })

(def datev-import-response-spec
  (ds/spec
    {:name ::datev-import-response
     :spec datev-import-response-data}))
