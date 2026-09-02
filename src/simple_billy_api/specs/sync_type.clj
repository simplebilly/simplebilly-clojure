(ns simple-billy-api.specs.sync-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sync-type-data
  {
   })

(def sync-type-spec
  (ds/spec
    {:name ::sync-type
     :spec sync-type-data}))
