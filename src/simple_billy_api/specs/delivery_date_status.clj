(ns simple-billy-api.specs.delivery-date-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-date-status-data
  {
   })

(def delivery-date-status-spec
  (ds/spec
    {:name ::delivery-date-status
     :spec delivery-date-status-data}))
