(ns simple-billy-api.specs.language-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def language-code-data
  {
   })

(def language-code-spec
  (ds/spec
    {:name ::language-code
     :spec language-code-data}))
