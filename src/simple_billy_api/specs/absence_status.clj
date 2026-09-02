(ns simple-billy-api.specs.absence-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def absence-status-data
  {
   })

(def absence-status-spec
  (ds/spec
    {:name ::absence-status
     :spec absence-status-data}))
