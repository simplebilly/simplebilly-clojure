(ns simple-billy-api.specs.stock-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def stock-update-request-data
  {
   (ds/req :quantity) int?
   })

(def stock-update-request-spec
  (ds/spec
    {:name ::stock-update-request
     :spec stock-update-request-data}))
