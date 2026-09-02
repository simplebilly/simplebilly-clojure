(ns simple-billy-api.specs.return-order-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-order-status-data
  {
   })

(def return-order-status-spec
  (ds/spec
    {:name ::return-order-status
     :spec return-order-status-data}))
